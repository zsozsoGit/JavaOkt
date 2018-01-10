package HRank;
import java.io.*;

public class StaticVsInstanceBenchmark
{
    public static void main( String[] args ) throws Exception
    {
        StaticVsInstanceBenchmark program = new StaticVsInstanceBenchmark();
        program.run();
    }

    static final int DURATION = 3;

    public void run() throws Exception
    {
        doBenchmark( new VirtualTest( new ClassWithVirtualMethod() ), 
                     new NonVirtualTest( new ClassWithNonVirtualMethod() ), 
                     new StaticTest() );
    }

    void doBenchmark( Test... tests ) throws Exception
    {
        System.out.println( "  Name          |  Iterations" );
        doBenchmark2( devNull, 1, tests ); //warmup
        doBenchmark2( System.out, DURATION, tests );
        System.out.println( "Done." );
    }

    void doBenchmark2( PrintStream printStream, int duration, Test[] tests ) throws Exception
    {
        for( Test test : tests )
        {
            long iterations = runTest( duration, test );
            printStream.printf( "%15s | %10d\n", test.getClass().getSimpleName(), iterations );
        }
    }

    long runTest( int duration, Test test ) throws Exception
    {
        test.terminate = false;
        test.count = 0;
        Thread thread = new Thread( test );
        thread.start();
        Thread.sleep( duration );
        test.terminate = true;
        thread.join();
        return test.count;
    }

    static abstract class Test implements Runnable
    {
        boolean terminate = false;
        long count = 0;
    }

    static class ClassWithStaticStuff
    {
        static int staticDummy;
        static void staticMethod() { staticDummy++; }
    }

    static class StaticTest extends Test
    {
        @Override
        public void run()
        {
            for( count = 0;  !terminate;  count++ )
            {
                ClassWithStaticStuff.staticMethod();
            }
        }
    }

    static class ClassWithVirtualMethod implements Runnable
    {
        int instanceDummy;
        @Override public void run() { instanceDummy++; }
    }

    static class VirtualTest extends Test
    {
        final Runnable runnable;

        VirtualTest( Runnable runnable )
        {
            this.runnable = runnable;
        }

        @Override
        public void run()
        {
            for( count = 0;  !terminate;  count++ )
            {
                runnable.run();
            }
        }
    }

    static class ClassWithNonVirtualMethod
    {
        int instanceDummy;
        final void nonVirtualMethod() { instanceDummy++; }
    }

    static class NonVirtualTest extends Test
    {
        final ClassWithNonVirtualMethod objectWithNonVirtualMethod;

        NonVirtualTest( ClassWithNonVirtualMethod objectWithNonVirtualMethod )
        {
            this.objectWithNonVirtualMethod = objectWithNonVirtualMethod;
        }

        @Override
        public void run()
        {
            for( count = 0;  !terminate;  count++ )
            {
                objectWithNonVirtualMethod.nonVirtualMethod();
            }
        }
    }

    static final PrintStream devNull = new PrintStream( new OutputStream() 
    {
        public void write(int b) {}
    } );
}