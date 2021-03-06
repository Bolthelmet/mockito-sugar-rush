# What it is

More concise syntax to use org.scalatest.mockito.MockitoSugar.mock:

Make your spec extend `MockitoSugarRush` trait

When having
```
val service = mock[Service]
```
instead of
```
when(service.method()).thenReturn(stubbedValue)
```
use 
```
service.method returns stubbedValue
```

# Installation
## SBT:
libraryDependencies += "com.github.bolthelmet" %% "mockito-sugar-rush" % "1.3.0" % Test

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
