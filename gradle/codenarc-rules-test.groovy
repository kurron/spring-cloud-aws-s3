/*
 * Copyright (c) 2017 Ronald D. Kurr kurr@jvmguy.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This set of rules was drawn from version CodeNarc 0.27.0
ruleset {

    description '''
        A Sample Groovy RuleSet containing all CodeNarc Rules, grouped by category.
        You can use this as a template for your own custom RuleSet.
        Just delete the rules that you don't want to include.
        '''

    // rulesets/basic.xml
    AssertWithinFinallyBlock
    AssignmentInConditional
    BigDecimalInstantiation
    BitwiseOperatorInConditional
    BooleanGetBoolean
    BrokenNullCheck
    BrokenOddnessCheck
    ClassForName
    ComparisonOfTwoConstants
    ComparisonWithSelf
    ConstantAssertExpression
    ConstantIfExpression
    ConstantTernaryExpression
    DeadCode
    DoubleNegative
    DuplicateCaseStatement
    DuplicateMapKey
    DuplicateSetValue
    EmptyCatchBlock
    EmptyClass
    EmptyElseBlock
    EmptyFinallyBlock
    EmptyForStatement
    EmptyIfStatement
    EmptyInstanceInitializer
    EmptyMethod
    EmptyStaticInitializer
    EmptySwitchStatement
    EmptySynchronizedStatement
    EmptyTryBlock
    EmptyWhileStatement
    EqualsAndHashCode
    EqualsOverloaded
    ExplicitGarbageCollection
    ForLoopShouldBeWhileLoop
    HardCodedWindowsFileSeparator
    HardCodedWindowsRootDirectory
    IntegerGetInteger
    MultipleUnaryOperators
    RandomDoubleCoercedToZero
    RemoveAllOnSelf
    ReturnFromFinallyBlock
    ThrowExceptionFromFinallyBlock

    // rulesets/braces.xml
    ElseBlockBraces
    ForStatementBraces
    IfStatementBraces
    WhileStatementBraces

    // rulesets/concurrency.xml
    BusyWait
    DoubleCheckedLocking
    InconsistentPropertyLocking
    InconsistentPropertySynchronization
    NestedSynchronization
    StaticCalendarField
    StaticConnection
    StaticDateFormatField
    StaticMatcherField
    StaticSimpleDateFormatField
    SynchronizedMethod
    SynchronizedOnBoxedPrimitive
    SynchronizedOnGetClass
    SynchronizedOnReentrantLock
    SynchronizedOnString
    SynchronizedOnThis
    SynchronizedReadObjectMethod
    SystemRunFinalizersOnExit
    ThisReferenceEscapesConstructor
    ThreadGroup
    ThreadLocalNotStaticFinal
    ThreadYield
    UseOfNotifyMethod
    VolatileArrayField
    VolatileLongOrDoubleField
    WaitOutsideOfWhileLoop

    // rulesets/convention.xml
    ConfusingTernary
    CouldBeElvis
    HashtableIsObsolete
    IfStatementCouldBeTernary
    InvertedIfElse
    LongLiteralWithLowerCaseL
    NoDef { enabled = false }
    NoTabCharacter
    ParameterReassignment
    TernaryCouldBeElvis
    TrailingComma
    VectorIsObsolete

    // rulesets/design.xml
    AbstractClassWithPublicConstructor
    AbstractClassWithoutAbstractMethod
    AssignmentToStaticFieldFromInstanceMethod
    BooleanMethodReturnsNull
    BuilderMethodWithSideEffects
    CloneableWithoutClone
    CloseWithoutCloseable
    CompareToWithoutComparable
    ConstantsOnlyInterface
    EmptyMethodInAbstractClass
    FinalClassWithProtectedMember
    ImplementationAsType
    Instanceof
    LocaleSetDefault
    NestedForLoop
    PrivateFieldCouldBeFinal
    PublicInstanceField
    ReturnsNullInsteadOfEmptyArray
    ReturnsNullInsteadOfEmptyCollection
    SimpleDateFormatMissingLocale
    StatelessSingleton
    ToStringReturnsNull

    // rulesets/dry.xml
    DuplicateListLiteral
    DuplicateMapLiteral
    DuplicateNumberLiteral
    DuplicateStringLiteral

    // Do not use these anymore.  They cause compilation errors during the build.
    // rulesets/enhanced.xml
    CloneWithoutCloneable { enabled = false }
    JUnitAssertEqualsConstantActualValue { enabled = false }
    UnsafeImplementationAsMap { enabled = false }

    // rulesets/exceptions.xml
    CatchArrayIndexOutOfBoundsException
    CatchError
    CatchException
    CatchIllegalMonitorStateException
    CatchIndexOutOfBoundsException
    CatchNullPointerException
    CatchRuntimeException
    CatchThrowable
    ConfusingClassNamedException
    ExceptionExtendsError
    ExceptionExtendsThrowable
    ExceptionNotThrown
    MissingNewInThrowStatement
    ReturnNullFromCatchBlock
    SwallowThreadDeath
    ThrowError
    ThrowException
    ThrowNullPointerException
    ThrowRuntimeException
    ThrowThrowable

    // rulesets/formatting.xml
    BlankLineBeforePackage
    BracesForClass
    BracesForForLoop
    BracesForIfElse
    BracesForMethod
    BracesForTryCatchFinally
    ClassJavadoc
    ClosureStatementOnOpeningLineOfMultipleLineClosure
    ConsecutiveBlankLines
    FileEndsWithoutNewline
    LineLength
    MissingBlankLineAfterImports
    MissingBlankLineAfterPackage
    SpaceAfterCatch
    SpaceAfterClosingBrace
    SpaceAfterComma
    SpaceAfterFor
    SpaceAfterIf
    SpaceAfterOpeningBrace
    SpaceAfterSemicolon
    SpaceAfterSwitch
    SpaceAfterWhile
    SpaceAroundClosureArrow
    SpaceAroundMapEntryColon
    SpaceAroundOperator
    SpaceBeforeClosingBrace
    SpaceBeforeOpeningBrace
    TrailingWhitespace

    // rulesets/generic.xml
    IllegalClassMember
    IllegalClassReference
    IllegalPackageReference
    IllegalRegex
    IllegalString
    IllegalSubclass
    RequiredRegex
    RequiredString
    StatelessClass

    // rulesets/grails.xml
    GrailsDomainHasEquals
    GrailsDomainHasToString
    GrailsDomainReservedSqlKeywordName
    GrailsDomainWithServiceReference
    GrailsDuplicateConstraint
    GrailsDuplicateMapping
    GrailsMassAssignment
    GrailsPublicControllerMethod
    GrailsServletContextReference
    GrailsSessionReference   // DEPRECATED
    GrailsStatelessService

    // rulesets/groovyism.xml
    AssignCollectionSort
    AssignCollectionUnique
    ClosureAsLastMethodParameter
    CollectAllIsDeprecated
    ConfusingMultipleReturns
    ExplicitArrayListInstantiation
    ExplicitCallToAndMethod
    ExplicitCallToCompareToMethod
    ExplicitCallToDivMethod
    ExplicitCallToEqualsMethod
    ExplicitCallToGetAtMethod
    ExplicitCallToLeftShiftMethod
    ExplicitCallToMinusMethod
    ExplicitCallToModMethod
    ExplicitCallToMultiplyMethod
    ExplicitCallToOrMethod
    ExplicitCallToPlusMethod
    ExplicitCallToPowerMethod
    ExplicitCallToRightShiftMethod
    ExplicitCallToXorMethod
    ExplicitHashMapInstantiation
    ExplicitHashSetInstantiation
    ExplicitLinkedHashMapInstantiation
    ExplicitLinkedListInstantiation
    ExplicitStackInstantiation
    ExplicitTreeSetInstantiation
    GStringAsMapKey
    GStringExpressionWithinString
    GetterMethodCouldBeProperty
    GroovyLangImmutable
    UseCollectMany
    UseCollectNested

    // rulesets/imports.xml
    DuplicateImport
    ImportFromSamePackage
    ImportFromSunPackages
    MisorderedStaticImports
    NoWildcardImports
    UnnecessaryGroovyImport
    UnusedImport

    // rulesets/jdbc.xml
    DirectConnectionManagement
    JdbcConnectionReference
    JdbcResultSetReference
    JdbcStatementReference

    // Some of these rules don't play well with Spock
    // rulesets/junit.xml
    ChainedTest
    CoupledTestCase
    JUnitAssertAlwaysFails
    JUnitAssertAlwaysSucceeds
    JUnitFailWithoutMessage
    JUnitLostTest
    JUnitPublicField
    JUnitPublicNonTestMethod { enabled = false }
    JUnitPublicProperty
    JUnitSetUpCallsSuper
    JUnitStyleAssertions
    JUnitTearDownCallsSuper
    JUnitTestMethodWithoutAssert
    JUnitUnnecessarySetUp
    JUnitUnnecessaryTearDown
    JUnitUnnecessaryThrowsException
    SpockIgnoreRestUsed
    UnnecessaryFail
    UseAssertEqualsInsteadOfAssertTrue
    UseAssertFalseInsteadOfNegation
    UseAssertNullInsteadOfAssertEquals
    UseAssertSameInsteadOfAssertTrue
    UseAssertTrueInsteadOfAssertEquals
    UseAssertTrueInsteadOfNegation

    // rulesets/logging.xml
    LoggerForDifferentClass
    LoggerWithWrongModifiers
    LoggingSwallowsStacktrace
    MultipleLoggers
    PrintStackTrace
    Println
    SystemErrPrint
    SystemOutPrint

    // rulesets/naming.xml
    AbstractClassName
    ClassName
    ClassNameSameAsFilename
    ClassNameSameAsSuperclass
    ConfusingMethodName
    FactoryMethodName
    FieldName
    InterfaceName
    InterfaceNameSameAsSuperInterface
    MethodName { enabled = false }
    ObjectOverrideMisspelledMethodName
    PackageName
    PackageNameMatchesFilePath
    ParameterName
    PropertyName
    VariableName

    // rulesets/security.xml
    FileCreateTempFile
    InsecureRandom
    JavaIoPackageAccess
    NonFinalPublicField
    NonFinalSubclassOfSensitiveInterface
    ObjectFinalize
    PublicFinalizeMethod
    SystemExit
    UnsafeArrayDeclaration

    // rulesets/serialization.xml
    EnumCustomSerializationIgnored
    SerialPersistentFields
    SerialVersionUID
    SerializableClassMustDefineSerialVersionUID

    // rulesets/size.xml
    AbcComplexity { enabled = false }  // DEPRECATED: Use the AbcMetric rule instead. Requires the GMetrics jar
    AbcMetric { enabled = false }  // Requires the GMetrics jar
    ClassSize
    CrapMetric { enabled = false }  // Requires the GMetrics jar and a Cobertura coverage file
    CyclomaticComplexity { enabled = false }  // Requires the GMetrics jar
    MethodCount
    MethodSize
    NestedBlockDepth
    ParameterCount

    // rulesets/unnecessary.xml
    AddEmptyString
    ConsecutiveLiteralAppends
    ConsecutiveStringConcatenation
    UnnecessaryBigDecimalInstantiation
    UnnecessaryBigIntegerInstantiation
    UnnecessaryBooleanExpression
    UnnecessaryBooleanInstantiation
    UnnecessaryCallForLastElement
    UnnecessaryCallToSubstring
    UnnecessaryCast
    UnnecessaryCatchBlock
    UnnecessaryCollectCall
    UnnecessaryCollectionCall
    UnnecessaryConstructor
    UnnecessaryDefInFieldDeclaration
    UnnecessaryDefInMethodDeclaration
    UnnecessaryDefInVariableDeclaration
    UnnecessaryDotClass
    UnnecessaryDoubleInstantiation
    UnnecessaryElseStatement
    UnnecessaryFinalOnPrivateMethod
    UnnecessaryFloatInstantiation
    UnnecessaryGString
    UnnecessaryGetter
    UnnecessaryIfStatement
    UnnecessaryInstanceOfCheck
    UnnecessaryInstantiationToGetClass
    UnnecessaryIntegerInstantiation
    UnnecessaryLongInstantiation
    UnnecessaryModOne
    UnnecessaryNullCheck
    UnnecessaryNullCheckBeforeInstanceOf
    UnnecessaryObjectReferences
    UnnecessaryOverridingMethod
    UnnecessaryPackageReference
    UnnecessaryParenthesesForMethodCallWithClosure
    UnnecessaryPublicModifier
    UnnecessaryReturnKeyword
    UnnecessarySafeNavigationOperator
    UnnecessarySelfAssignment
    UnnecessarySemicolon
    UnnecessaryStringInstantiation
    UnnecessarySubstring
    UnnecessaryTernaryExpression
    UnnecessaryToString
    UnnecessaryTransientModifier

    // rulesets/unused.xml
    UnusedArray
    UnusedMethodParameter
    UnusedObject
    UnusedPrivateField
    UnusedPrivateMethod
    UnusedPrivateMethodParameter
    UnusedVariable


}