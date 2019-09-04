package br.com.fiap.revisaoandroidnac

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class PessoaAdapter : ListAdapter<Pessoa, PessoaAdapter.PessoaViewHolder>(PessoaDiffUtils()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PessoaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pessoa_layout, null)


        return PessoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PessoaViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class PessoaViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        private var nomeText : TextView = itemView.findViewById(R.id.nome)
        private var idadeText : TextView = itemView.findViewById(R.id.idade)
        private var votouText : TextView = itemView.findViewById(R.id.votou)

        fun bind(pessoa: Pessoa){
            with(pessoa){
                nomeText.text = nome
                idadeText.text = idade.toString()
                votouText.text = votou.toString()
            }
        }
    }

    class PessoaDiffUtils : DiffUtil.ItemCallback<Pessoa>() {
        override fun areItemsTheSame(p1: Pessoa, p2: Pessoa): Boolean {
            return  p1 == p2
        }

        override fun areContentsTheSame(p1: Pessoa, p2: Pessoa): Boolean {
            return p1.nome == p2.nome
        }
    }
}