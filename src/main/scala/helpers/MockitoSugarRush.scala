package helpers
import org.mockito.Mockito._
import org.mockito.stubbing.OngoingStubbing
import org.scalatest.mockito.MockitoSugar

trait MockitoSugarRush extends MockitoSugar {
  implicit def toWhenOps[R](mockMethod: R) = {
    new WhenClause(when(mockMethod))
  }

  class WhenClause[T](whenClause: OngoingStubbing[T]) {
    def returns(result: T) = whenClause.thenReturn(result)
  }
}

