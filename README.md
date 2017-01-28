More concise syntax to use org.scalatest.mockito.MockitoSugar.mock:
Instead of
val service = mock[Service]
when(service.method()).thenReturn(stubbedValue)

Use """service.method returns stubbedValue"""
