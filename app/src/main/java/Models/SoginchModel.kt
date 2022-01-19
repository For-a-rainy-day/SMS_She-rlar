package Models

import java.io.Serializable

class SoginchModel:Serializable {

    var name=""
    var code=""

    constructor(name: String, code: String) {
        this.name = name
        this.code = code
    }
}