package com.example.fragmentsudacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.*
import androidx.navigation.findNavController
import com.example.fragmentsudacity.databinding.FragmentFrag1Binding
import com.example.fragmentsudacity.databinding.FragmentFrag2Binding
import java.util.*


class Frag2 : Fragment() {

    private var _binding: FragmentFrag2Binding? = null

    private val  binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFrag2Binding.inflate(inflater,container,false)
        foodroulette()

        _binding!!.RetornarAoInicio.setOnClickListener{view : View -> view.findNavController().navigate(R.id.action_frag2_to_frag1)}
        _binding!!.JogarNovamente.setOnClickListener { foodroulette()}
            return binding.root

    }
    private fun foodroulette() {

        val randomint = Random().nextInt(31) + 1

        val image = when (randomint) {
            1 -> R.drawable.acai              2 -> R.drawable.batata_recheada
            3 -> R.drawable.beirute           4 -> R.drawable.buchada
            5 -> R.drawable.cachorro_quente   6 -> R.drawable.caldo_verde
            7 -> R.drawable.camarao           8 -> R.drawable.canjiquinha
            9 -> R.drawable.churrasco         10 -> R.drawable.coxinhas
            11 -> R.drawable.empadas          12 -> R.drawable.esfirras
            13 -> R.drawable.feijoada         14 -> R.drawable.fondue
            15 -> R.drawable.frango_frito     16 -> R.drawable.fritas
            17 -> R.drawable.hamburguer       18 -> R.drawable.kibe
            19 -> R.drawable.lagosta          20 -> R.drawable.lasanha
            21 -> R.drawable.macarrao         22 -> R.drawable.melhao
            23 -> R.drawable.ostras           24 -> R.drawable.pastel
            25 -> R.drawable.peixe            26 -> R.drawable.pirao
            27 -> R.drawable.pizza            28 -> R.drawable.rondelli
            29 -> R.drawable.sushi            30 -> R.drawable.tacos
            else -> R.drawable.vaca_atolada

        }
        _binding!!.Frag2text.setImageResource(image)

        _binding!!.NomeComida.text = when (randomint) {
            1 -> "Açaí"            2 -> "Batata Recheada"
            3 -> "Beirute"         4 -> "Buchada"
            5 -> "Hot Dog"         6 -> "Caldo Verde"
            7 -> "Camarão"         8 -> "Canjiquinha"
            9 -> "Churrasco"       10 -> "Coxinha"
            11 -> "Empada"         12 -> "Esfirra"
            13 -> "Feijoada"       14 -> "Fondue"
            15 -> "Frango Frito"   16 -> "Fritas"
            17 -> "Hamburguer"     18 -> "Kibe"
            19 -> "Lagosta"        20 -> "Lasanha"
            21 -> "Macarrão"       22 -> "Melhão"
            23 -> "Ostras"         24 -> "Pastel"
            25 -> "Peixe"          26 -> "Pirão"
            27 -> "Pizza"          28 -> "Rondelli"
            29 -> "Sushi"          30 -> "Tacos"
            else -> "Vaca Atolada"
        }
    }
}








