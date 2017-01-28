# What it is

More concise syntax to use org.scalatest.mockito.MockitoSugar.mock:
Instead of
```
val service = mock[Service]
when(service.method()).thenReturn(stubbedValue)
```
Use `service.method returns stubbedValue`

# Installation
## SBT:
libraryDependencies +=

## Maven:

# Usage:

```
import org.scalatest.{FreeSpec, Matchers}

class MockitoSugarRushSpec extends FreeSpec with MockitoSugarRush with Matchers{

  val okayNumber = 4
  val theNumberOfTheBeast = 666

  "return should" - {
    "setup mocks" in {
      val service = mock[FooService]
      service.bar returns theNumberOfTheBeast
      service.bar shouldBe theNumberOfTheBeast
    }
  }

  class FooService {
    def bar = okayNumber
  }
}
```
