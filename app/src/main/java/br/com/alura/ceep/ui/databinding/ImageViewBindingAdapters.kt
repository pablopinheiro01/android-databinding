package br.com.alura.ceep.ui.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import br.com.alura.ceep.ui.extensions.carregaImagem

//este adapter foi criado para carregar a imagem, o primeiro campo ja é detectado automaticamente pelo xml
//por este motivo nao recebemos um erro ao enviar somente a url na declaração
//feito uma extensão de imageView para carregar automaticamente
@BindingAdapter("carregaImagem")
//devemos ter o cuidado no tratamento desse metodo devido o retorno que pode ser nulo, por este motivo
//devemos estar atentos ao uso dos metodos onde temos a certeza que os objetos podem ser nulos ou nao
fun ImageView.carregaImagemPorURL(url: String?){
    url?.let{ carregaImagem(url) }
}