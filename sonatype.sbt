sonatypeProfileName := "com.github.bolthelmet"

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

useGpg := true

pgpReadOnly := false

publishMavenStyle := true

publishArtifact in Test := false

pomExtra in Global := {
  <url>https://github.com/Bolthelmet/mockito-sugar-rush.git</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/(your repository URL)</connection>
      <developerConnection>scm:git:git@github.com:Bolthelmet:mockito-sugar-rush</developerConnection>
      <url>github.com/Bolthelmet/mockito-sugar-rush</url>
    </scm>
    <developers>
      <developer>
        <id>bolthelmet</id>
        <name>Alexey Novoseltsev</name>
        <url>https://fi.linkedin.com/in/alex-novoseltsev-6729b298</url>
      </developer>
    </developers>
}