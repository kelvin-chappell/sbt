addCompilerPlugin("org.wartremover" %% "wartremover" % "2.4.13")

scalacOptions += "-P:wartremover:only-warn-traverser:org.wartremover.warts.Unsafe"

