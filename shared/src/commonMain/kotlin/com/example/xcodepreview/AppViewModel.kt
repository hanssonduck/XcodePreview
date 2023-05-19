package com.example.xcodepreview

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.MutableStateFlow
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState

class AppViewModel : KMMViewModel() {
    @NativeCoroutinesState
    val input = MutableStateFlow(viewModelScope, "")
}
