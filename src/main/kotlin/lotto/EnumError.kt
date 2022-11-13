package lotto

interface EnumErrorInterface {
    fun checkErrorType(type: ErrorType): String
}

class EnumError() : EnumErrorInterface {
    override fun checkErrorType(type: ErrorType): String {
        return when (type) {
            ErrorType.NotDivideWithThousand -> "입력된 수가 로또 구매 금액으로 나누어 떨어지지 않습니다."
            ErrorType.NotOnlyNumber -> "숫자가 아닌 문자가 포함되어 있습니다."
            ErrorType.NotExpectedError -> "예기치 않은 오류가 발생했습니다."
        }
    }
}

enum class ErrorType() {
    NotDivideWithThousand,
    NotOnlyNumber,
    NotExpectedError
}
