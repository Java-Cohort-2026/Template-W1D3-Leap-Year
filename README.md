# W1D3 Assignment: The Leap Year Validator

### The Scenario
Calendar logic is notoriously tricky in software engineering. Today, you are tasked with building the core logic for a calendar application that determines if a given year is a leap year.

### The Rules of a Leap Year
It isn't as simple as just dividing by 4! According to the Gregorian calendar, a year is a leap year if:
1. It is evenly divisible by 4.
2. **However**, if it is divisible by 100, it is **NOT** a leap year...
3. **Unless** it is also divisible by 400, then it **IS** a leap year.

### Your Mission
Open `src/Main.java`. You will see a variable called `year` and a boolean variable called `isLeap`.
- Write the `if/else` logic or use logical operators (`&&`, `||`, `!`, `%`) to correctly evaluate the `year`.
- Update the `isLeap` variable to `true` or `false` based on your math.

**⚠️ CRITICAL INSTRUCTION:** 
Do not change the line of code that says `int year = 2024;`. 
The Auto-Grader is going to magically inject different years (like 1900 and 2000) into that exact line to test if your algorithm is bulletproof. If you change the variable name or the line it sits on, the test will fail!

### Success Criteria
When you push your code, the auto-grader will run three tests:
- **Test 1:** Checks a standard leap year (e.g., 2024)
- **Test 2:** Checks a century year that is NOT a leap year (e.g., 1900)
- **Test 3:** Checks a century year that IS a leap year (e.g., 2000)
