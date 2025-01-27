def totient(n):
    ans = n
    p = 2
    while p * p <= n:
        if n % p == 0:
            while n % p == 0:
                n //= p
            ans -= ans // p
        p += 1
    if n > 1:
        ans -= ans // n
    return ans

def divisor_sigma(n):
    ans = 0
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            ans += i
            if i != n // i: 
                ans += n // i
    return ans

def final_count(x, c):
    count = 0
    for n in range(1, x + 1):
        sigman = divisor_sigma(n) 
        phisigman = totient(sigman) 
        if phisigman <= c * n:
            count += 1
    return count


x = int(input("Enter the value of x: ")) 
c = int(input("Enter the value of c: ")) 
ans = final_count(x, c)
print(f"Number of integers n ≤ {x} that satisfy φ(σ(n)) ≤ {c}n: {ans}")
