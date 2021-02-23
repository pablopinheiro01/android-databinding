package br.com.alura.ceep.ui.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import br.com.alura.ceep.ui.extensions.carregaImagem

//este adapter foi criado para carregar a imagem, o primeiro campo ja é detectado automaticamente pelo xml
//por este motivo nao recebemos um erro ao enviar somente a url na declaração
//feito uma extensão de imageView para carregar automaticamente
@BindingAdapter("carregaImagem")
fun ImageView.carregaImagemPorURL(url: String){
    carregaImagem(url)
}