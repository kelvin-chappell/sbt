//scalacOptions ++= Seq(
// "-deprecation", // Warning and location for usages of deprecated APIs.
//  "-encoding", "utf-8", // Specify character encoding used by source files.
//  "-explaintypes", // Explain type errors in more detail.
//  "-feature",  // For features that should be imported explicitly.
//  "-unchecked",  // Generated code depends on assumptions.
//  "-Xcheckinit",  // Wrap field accessors to throw an exception on uninitialized access.
//  "-Xlint",
//  "-Xlint:adapted-args",  // An argument list is modified to match the receiver.
//  "-Xlint:constant",  // Constant arithmetic expression results in an error.
//  "-Xlint:delayedinit-select",  // Selecting member of DelayedInit.
//  "-Xlint:doc-detached",  // A detached Scaladoc comment.
//  "-Xlint:inaccessible",  // Inaccessible types in method signatures.
//  "-Xlint:infer-any",  // A type argument is inferred to be `Any`.
//  "-Xlint:missing-interpolator",  // A string literal appears to be missing an interpolator id.
//  "-Xlint:nullary-override",  // Warn when non-nullary `def f()' overrides nullary `def f'.
//  "-Xlint:nullary-unit",  // Warn when nullary methods return Unit.
//  "-Xlint:option-implicit",  // Option.apply used implicit view.
//  "-Xlint:package-object-classes",  // Class or object defined in package object.
//  "-Xlint:poly-implicit-overload",  // Parameterized overloaded implicit methods are not visible as view bounds.
//  "-Xlint:private-shadow",  // A private field (or class parameter) shadows a superclass field.
//  "-Xlint:stars-align",  // Pattern sequence wildcard must align with sequence component.
//  "-Xlint:type-parameter-shadow",  // A local type parameter shadows a type already in scope.
//  "-Ywarn-extra-implicit",  // More than one implicit parameter section is defined.
//  "-Ywarn-unused",
//  "-Ywarn-unused:implicits",  // An implicit parameter is unused.
//  "-Ywarn-unused:imports",   // An import selector is not referenced.
//  "-Ywarn-unused:locals",   // A local definition is unused.
//  "-Ywarn-unused:patvars",   // A variable bound in a pattern is unused.
//  "-Ywarn-unused:privates"  // A private member is unused.
//)

//(scalacOptions in (Compile)) ~= (_ filterNot (_ == "-Xfatal-warnings"))

//scalacOptions in (Test) := (scalacOptions in (Compile)).value

//wartremoverWarnings ++= Warts.unsafe
//wartremoverWarnings in (Compile, compile) += wartremover.Wart.Nothing

/*
wartremoverErrors ++= wartremover.Warts.allBut(
  Wart.Any,
  Wart.ArrayEquals,
  Wart.AsInstanceOf, 
  Wart.DefaultArguments,
  Wart.EitherProjectionPartial,
  Wart.Equals,
  Wart.ExplicitImplicitTypes,
  Wart.FinalCaseClass,
  Wart.ImplicitConversion,
  Wart.ImplicitParameter,
  Wart.IsInstanceOf,
  Wart.JavaSerializable, 
  Wart.LeakingSealed,
  Wart.MutableDataStructures,
  Wart.NonUnitStatements,
  Wart.Nothing, 
  Wart.Null,
  Wart.OptionPartial,
  Wart.Option2Iterable,
  Wart.Overloading, 
  Wart.Product,
  Wart.PublicInference,
  Wart.Recursion, 
  Wart.Serializable,
  Wart.StringPlusAny,
  Wart.Throw,
  Wart.ToString,
  Wart.TraversableOps,
  Wart.TryPartial,
  Wart.Var,
  Wart.While
)
*/

//addCompilerPlugin("org.wartremover" %% "wartremover" % "2.4.13" cross CrossVersion.full)

addCompilerPlugin("org.wartremover" %% "wartremover" % "2.4.13")

scalacOptions += "-P:wartremover:only-warn-traverser:org.wartremover.warts.Unsafe"

