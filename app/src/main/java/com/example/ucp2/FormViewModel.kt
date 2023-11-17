package com.example.ucp2

import androidx.lifecycle.ViewModel
import com.example.ucp2.Data.FormUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FormViewModel:ViewModel() {
    private val _stateUI = MutableStateFlow(FormUIState())
    val stateUI: StateFlow<FormUIState> = _stateUI.asStateFlow()

    fun setData(ListContact : MutableList<String>) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = ListContact[0],
                nim = ListContact[1],
                konsentrasi = ListContact[2],
                judul = ListContact[3]
            )
        }
    }

    fun setDosenPem1(Dosen1: String) {
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dospem_1 = Dosen1) }
    }

    fun setDosenPem2(Dosen2: String) {
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dospem_2 = Dosen2) }
    }

}