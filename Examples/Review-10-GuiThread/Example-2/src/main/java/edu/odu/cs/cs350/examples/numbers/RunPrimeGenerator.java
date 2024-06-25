package edu.odu.cs.cs350.examples.numbers;

import java.util.List;

/**
 * A simple command line test driver for Prime Generator.
 */
public class RunPrimeGenerator {
    /**
     * The main function for the command line prime number generator.
     */
    public static void main(String[] args)
    {
        PrimeGenerator gen = new PrimeGenerator();

        // List of generated primes.
        List<Integer> primes;

        // Number of primes to generate.
        int numPrimes = 0;

        // Parse command line argument 1
        try {
            numPrimes = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            numPrimes = 10;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            numPrimes = 10;
        }

        // The primes 2 and 3 are added automatically by the generator
        numPrimes -= 2;

        // Generate numPrimes prime numbers
        System.out.format("Generating %d Prime Numbers%n", numPrimes);

        for (int i = 0; i < numPrimes; i++) {
            gen.next();
        }

        // Print the resulting list of primes
        System.out.println();
        // System.out.format("Prime Numbers Generated: \n", numPrimes); // oops
        System.out.println("Prime Numbers Generated:");

        // Retrieve the list of generated primes
        primes = gen.getPrimes();

        // Print each prime
        for (Integer i : primes) {
            System.out.println(i);
        }
    }
}
