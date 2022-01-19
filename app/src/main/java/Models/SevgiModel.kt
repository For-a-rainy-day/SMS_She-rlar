package Models

import java.io.Serializable

class SevgiModel:Serializable {

    var name=""
    var code=""

    constructor(name: String, code: String) {
        this.name = name
        this.code = code
    }
}