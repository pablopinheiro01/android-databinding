package br.com.alura.ceep.ui.databinding

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import br.com.alura.ceep.model.Nota

class NotaData (
    val nota: Nota,
    val titulo: ObservableField<String> = ObservableField(nota.titulo),
    val descricao: ObservableField<String> = ObservableField(nota.descricao),
    val favorita: ObservableBoolean = ObservableBoolean(nota.favorita),
    val imagemUrl: ObservableField<String> = ObservableField(nota.imagemUrl)
    )