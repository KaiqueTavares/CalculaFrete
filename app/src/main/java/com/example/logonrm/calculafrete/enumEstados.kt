package com.example.logonrm.calculafrete

/**
 * Created by logonrm on 13/04/2018.
 */
enum class enumEstados (val id:Int) {
    SP(1),
    MG(2),
    RJ(3),
    BH(4);

    companion object {
        fun from(findValue: Int):enumEstados = enumEstados.values().first { it.id == findValue }
    }
}