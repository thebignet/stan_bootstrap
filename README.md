# Stan's Temperature Record

## Bootstrap setup

You can clone this repository for a simple Maven project which includes test artifacts
https://github.com/thebignet/stan_bootstrap/tree/temperature-sensor

Import it in an IDE, change the branch to `temperature-sensor` and let maven download the dependencies while we move to the next section

## Throughout this interview

- Share your screen
- Explain out loud what you are doing at any time as this will make the interview easier for us to understand and help you overcome blockers which are not relevant to the interview.
- You can use any resource on the internet to help you code.

### Things we'll be looking for

- API design for the library
  - methods, naming and data types and structures
- testing
  - it is preferred to have tests drive the implementation and have an emergent design
- reasonable and simple design for temperature storage
- working implementation
- discussion on scalability
- skills with IDE of choice
- communication skills

## Introduction

We have a temperature sensor that measures the temperature every second.
We'd like to write a simple Java library that can take those temperatures, store them and then allow us to read the temperatures back again.

Here is the implementation of the temperature sensor which is in `TemperatureSensor`

```java
public double sense(){
  return new Random().nextDouble() * 100;
}
```

## Exercise

### API Design

Design the API for the library that will store the temperatures and have the ability to read back the latest temperature (no implementation) in `Registry`.

### Business Requirements

For each of the following requirements, write a test in `RegistryTest` **first and only then** make it pass in the simplest way.
The test has to be failing before changing the implementation to make it pass.
After the test is passing, you can refactor as needed.

<img src="https://gist.github.com/user-attachments/assets/ab1a0acf-9827-48ef-8f03-eef4b43d1fc0e" width="500">

#### Simplest implementation (using `SimpleRegistry`)

1. **Given** that I write a temperature, **then** I should be able to read it.
2. **Given** that I write multiple temperatures, **then** I should read the last one. 
  - I should also be able to read the last temperature a second time.
3. **Given** that I write temperatures every second for one minute, **then** I should be able to read the one from 30s ago.
  - For this test, you will have to add a new API to `Registry`.
  - Keep the API as simple as possible for retrieving the 30th last temperature.

#### Stateful implementation (add a new implementation of `Registry`)

This means that we should be able to write using one instance of `Registry`, and read using another one (the instances should not share memory).
What would be the simplest way to be able to store information on your machine that could persist even when restarting a JVM ?

1. **Given** that I write a temperature, **then** I should be able to read it.
2. **Given** that I write multiple temperatures, **then** I should read the last one.
- I should also be able to read the last temperature a second time.
3. **Given** that I write temperatures every second for one minute, **then** I should be able to read the one from 30s ago.
  - Think about the file format that you would need to use

## Possible extensions (do not read this until you have finished the above)

- Temperatures are not stored every second anymore. They can be stored say every 5s. We still need to get the temperature for any timestamp. If the temperature was not recorded at a specific timestamp, we would use the first previous timestamp.
- Add a REST API to the library allowing writing temperatures and querying them back out again
- The API needs to accept a location field to allow us to measure temperature in multiple locations and query the temperature for specific locations.

