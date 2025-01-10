# Unit Testing with Mockito - Java

This is a simple Java project demonstrating how to write unit tests using **Mockito** and **JUnit 5**. The test checks the functionality of the `ZombieList` class, which interacts with a mock `GoogleZombieConnector`.

## Project Structure

- **ZombieList.java**: Contains the logic for filtering bio-organisms.
- **GoogleZombieConnector.java**: Interface for retrieving bio-organisms from a region.
- **ZombieListTest.java**: Unit test class using **Mockito** to mock the `GoogleZombieConnector` and **JUnit 5** for testing.

## Dependencies

To run the tests, make sure you have the following dependencies in your `pom.xml` file.

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>4.0.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.8.2</version>
    <scope>test</scope>
</dependency>
```

## Maven Command to Add Dependencies
Run the following command to add the dependencies to your pom.xml file:
```
mvn install
```
## Running the Tests
To run the unit tests, use the following Maven command:
```
mvn test
```
This will execute the tests in ZombieListTest.java, where we mock the GoogleZombieConnector and verify the filterOrgans method works as expected.

## How the Test Works

- **Mockito Mocking:** We mock the `GoogleZombieConnector` using **Mockito**.
- **Stubbing Methods:** The `findBodies` method is stubbed to return a predefined list of bio-organisms.
- **JUnit Assertions:** The test verifies that the `ZombieList` correctly filters bio-organisms based on the given criteria.
- **Mock Verification:** We also verify that the `findBodies` method was called once during the test.

## License

This project is free to use.
