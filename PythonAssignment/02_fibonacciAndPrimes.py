#Prime Filtering Function
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

# Fibonacci Sequence Generation
def fibonacci_up_to_n(N):
    """Generate Fibonacci sequence up to N and filter primes."""
    fib_sequence = [0, 1]
    while fib_sequence[-1] + fib_sequence[-2] <= N:
        fib_sequence.append(fib_sequence[-1] + fib_sequence[-2])

    #Display the Fibonacci sequence
    print(f"Fibonacci Sequence up to {N}: {fib_sequence}")

    # Filter prime numbers from the Fibonacci sequence
    prime_fibs = [num for num in fib_sequence if is_prime(num)]
    # Display the prime numbers in the Fibonacci sequence
    print(f"Prime Numbers in Fibonacci Sequence: {prime_fibs}")

# Input the range limit from user
N = int(input("Enter a number N to generate Fibonacci sequence up to N: "))
# Function call to generate Fibonacci sequence and filter primes
fibonacci_up_to_n(N)
