package Models

import java.io.Serializable

class OtaOnaModels:Serializable {

    var name=""
    var code=""

    constructor(name: String, code: String) {
        this.name = name
        this.code = code
    }
}