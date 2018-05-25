# 코틀린이란?
     코틀린이라는 이름은 코틀린 개발팀이 대부분 살고 있는 러시아의 상트페테르부르크 근처에 있는 섬 이름이라고 합니다. 코틀린에 대한 아이디어는 J
     etBrain에서 생겼습니다. JetBrain팀은 .Net팀처럼 강력하고 빠르게 진화하는 자바를 대신할 만한 언어를 찾고 싶어했습니다. JVM과 호환되면
     서 static-typing 이어야야하고 배우기 쉽고 뜻을이해하기 쉬운 생산성 높은 언어가 필요했습니다. 코틀린은 first-repository-commit 이
     후 5년이넘는 시간이 지나서야 1.0이 나왔습니다.

## 기본 특성
    1. 저장할 때 .kt라는 확장자가 파일에 붙고 컴파일되면 자바처럼 .class 파일을 만들어 냅니다.
    2. JVM 기반에서 실행되는 프로그래밍언어 입니다. 따라서 자바서버 및 안드로이드와 상호운용성(interoperability)이 있습니다.
       - 자바6부터 호환됩니다.
       - Anko 라이브러리를 통해 안드로이드 API에 대한 코틀린 어댑터를 제공받을 수 있습니다.
    3. 자바에 비해 짧은 코드로 구현할 수 있습니다.
    4. 자바와 마찬가지로 정적타입(statically-typed)지정 언어입니다. 자바와의 차이점은 모든 변수 타입을 프로그래머가 직접 명시할 필요는 없습
       니다. 타입추론(type inference)이 가능합니다.
    5. 함수형프로그래밍과 객체지향프로그래밍 스타일을 모두 지원합니다.

## 기본 문법
    코틀린은 패키지를 네임스페이스를 관리하기 위한용도로만 사용합니다.

## 함수
    일반함수
    로컬함수
    최상위함수(Top-level function)
    확장함수(Extension Function)
    
## 클래스, 객체, 인터페이스

## 1. class

### data class
     데이터 클래스를 사용하면 컴파일러가 equals, hashCode, toString, copy 등의 메소드를 자동으로 생성해 줍니다.

## 2. object 

### 2-1. obejct class
    object 키워드를 사용한 객체선언(object-declaration)은 singleton을 생성할 수 있습니다.

### 2-2. companion object
     보통 factory-method와 static-member를 선언을 위해 사용한다고 하는데, 일반클래스 내부에 이름없이 "companion object {}"로 추가하여 멤버나 함
    수를 추가할 수 있습니다. 이름을 붙이면 "companion object A {}"와 같이 추가할 수 있습니다. 클래스 내부에 정의되었지만 상속과 구현이 가능합니다. 이름
    을 붙이지 않으면 Companion이라는 이름으로 참조에 접근할 수 있습니다.

### 2-3. anonymous object
    Kotlin의 익명객체는 java의 anonymous-inner-class를 대신한다고 보면 되며 object 키워드를 이름없이 사용하면 됩니다. (인자로 넘기거나 값에 할당
    하거나) Kotlin의 익명객체는 Java와는 다르게 상속과 구현이 가능하며 final이 아닌 변수도 객체 식 안에서 사용할 수 있습니다. 객체선언과의 차이점은 사용
    될 때마다 새로운 인스턴스가 생성된다는 점입니다. 

# 예외
    Java에서는 checked-exception을 명시적으로 처리해야 하지만 Kotlin은 다른 최신 JVM 언어와 마찬가지로 checked-exception과 unchecked-exce
    ption을 구분하지 않으며 checked-exception을 강제화하지 않기 때문에 예외를 잡아도되고 안 잡아도 됩니다.
    

