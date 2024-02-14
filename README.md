# tutorial-1

Sheryl Ivana W
2206824943
Kelas: A

<details>
<summary>Tutorial 1</summary>
**Reflection 1**  
You already implemented two new features using Spring Boot. Check again your source code and evaluate the coding standards that you have learned in this module. Write clean code principles and secure coding practices that have been applied to your code.  If you find any mistake in your source code, please explain how to improve your code. **Please write your reflection inside the repository's README.md file.**  

Some of the clean codes principles (not all of them) that I applied are:

I used clear, concise, and meaningful names for variables and functions so that my code is easy to understand (no comments required for now)
I kept the function sizes small and focused on one specific task

Secure coding practices that I followed are:
Post method for creating products

Errors that I encountered while doing this assignment:

I created test functions in main instead of test which prevented JUnit from being recognized by Code Editor:
Solution: I transferred all test functions to test folder

Selenium was not working:
Solution: I missed ‘$’ in the @Value

Edit product request was doing GET instead of POST:
Solution: I used a hidden input form field to store the Product ID instead of putting it in the URL (Not secure but I have not found a better way yet)
Update: I corrected the delete and edit requests to use the right methods

Response stopped

New topic

**Reflection 2**
1. After writing the unit test, how do you feel? How many unit tests should be made in a class? How to make sure that our unit tests are enough to verify our program? It would be good if you learned about code coverage. Code coverage is a metric that can help you understand how much of your source is tested. If you have 100% code coverage, does that mean your code has no bugs or errors?

I feel more confident about my code after doing unit tests. There is no definitive answer for how many unit tests a class should have, but some experts recommend that it should cover 80% of the code. To ensure that our unit tests are sufficient to validate our program, we need to test all features in our program so there are no unhandled cases. Even with 100% code coverage, there are still many false-positives and false-negatives, so it does not guarantee that our code is error-free or bug-free.

2. Suppose that after writing the CreateProductFunctionalTest.java along with the corresponding test case, you were asked to create another functional test suite that verifies the number of items in the product list. You decided to create a new Java class similar to the prior functional test suites with the same setup procedures and instance variables.  
   What do you think about the cleanliness of the code of the new functional test suite? Will the new code reduce the code quality? Identify the potential clean code issues, explain the reasons, and suggest possible improvements to make the code cleaner!  
   I think the code of the new functional test suite is not very clean. It has some issues that could reduce the code quality and make it harder to maintain and understand. Here are some of the potential clean code issues I found, along with the reasons and possible improvements:

   - The code has too many comments. Comments are useful to explain the intent or purpose of the code, but they should not be used to describe what the code does. The code itself should be clear and self-explanatory. Too many comments can clutter the code and make it harder to read. They can also become outdated and misleading if the code changes. A possible improvement is to remove unnecessary comments and use meaningful names for variables, functions, and classes instead.
   - The code has long and complex functions. Functions should be small and do only one thing. Long and complex functions are hard to understand, test, and debug. They can also introduce side effects and dependencies that make the code less modular and reusable. A possible improvement is to break down long and complex functions into smaller and simpler ones, and use descriptive names for them.
   - The code has magic numbers and strings. Magic numbers and strings are literal values that are used directly in the code without any explanation. They can make the code hard to understand, modify, and maintain. They can also introduce errors and inconsistencies if they are used in multiple places. A possible improvement is to replace magic numbers and strings with constants or variables, and give them meaningful names

</details>
<details>
<summary>Tutorial 2</summary>
link koyeb: https://eshop-sheryl.koyeb.app/
Masalah Kualitas Kode yang Diperbaiki:

Masalah "The instance method name 'HomePage' doesn't match '[a-z][a-zA-Z0-9]*'" oleh PMD:
Solusi: Menggunakan gaya penulisan camel case untuk nama metode.
Masalah "Unnecessary modifier 'public' on method '...': the method is declared in an interface type" oleh PMD:
Solusi: Menghapus modifier public pada metode dalam antarmuka (interface).
Masalah "This utility class has a non-private constructor" oleh PMD:
Solusi: Masalah ini diabaikan karena jika kita menambahkan konstruktor private di kelas EshopApplication, program tidak akan dapat dijalankan (false-positive).
Implementasi CI/CD dalam Workflows (GitHub)/Pipelines (GitLab):
Implementasi saat ini sudah memenuhi definisi Continuous Integration dan Continuous Deployment. Proyek ini telah menerapkan CI yang mencakup fase Code dan Test. CI diwakili oleh file ci.yml yang otomatis menguji proses setiap kali ada pull, push, atau merge ke repositori. Untuk Deployment, Koyeb juga telah mengimplementasikan CI/CD untuk otomatisasi proses deployment setiap kali ada pull, push, atau merge dari repositori. Ini mencakup fase Review dan Operasional dalam Continuous Delivery/Deployment.

</details>
