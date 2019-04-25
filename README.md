# countries :: a kata to become familiar with Optional, Stream & Lambdas

## Building the project

The project uses [Apache Maven](http://maven.apache.org/) to build.

If you have maven installed, you can build and run the tests via `mvn clean test`.
If you have not maven, then you can use the provided wrapper via `mvnw clean test`

## Work in your preferred IDE

Ideally you should load the project inside your prefer IDE and make sure you can run the tests.

## Running the kata

The kata will mainly consist in making the tests to pass.

At each step you will have to uncomment the tests corresponding to the step and make them pass.

### Step 1 : retrieving countries by their capital

1. Uncomment the `STEP-1` tests in CountryServiceTest
1. Make the tests to pass by modifying the CountryService implementation
1. Refactor `CountryServiceTest#can_find_paris()` to remove the `isPresent()` call in favor 
of a more suited `Optional` method call.

