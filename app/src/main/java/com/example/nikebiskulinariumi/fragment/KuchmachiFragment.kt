package com.example.nikebiskulinariumi.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.nikebiskulinariumi.R

class KuchmachiFragment : Fragment(R.layout.fragment_kuchmachi) {

    private lateinit var ingredient2: TextView
    private lateinit var shemadgenloba2: TextView
    private lateinit var textView3: TextView
    private lateinit var wesi2: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ingredient2 = requireView().findViewById(R.id. ingredient2)
        shemadgenloba2 = requireView().findViewById(R.id. shemadgenloba2)
        textView3 = requireView().findViewById(R.id. textView3)
        wesi2 = requireView().findViewById(R.id. wesi2)


        shemadgenloba2.text = "ძმარი\n" + "მარილი და წიწაკა\n" + "ყვითელი ყვავილი - 1 ჩ.კ\n" + "ხმელი ქონდარი - 1 ჩ.კ\n" + "ქინძი - 1 კონა\n"

        wesi2.text = "ღორის გულ-ღვიძლი მოვხარშოთ, მოვაყაროთ მარილი და გავაციოთ.\n" +
                "\n" +
                "ნიგოზი, ნიორი, ხმელი და ახალი ქინძი ერთად დავნაყოთ. დავუმატოთ წვრილად დაჭრილი ხახვი, დაფქული ყვითელი ყვავილი, ხმელი ქონდარი, უცხო სუნელი, მარილი და წიწაკა. სანელებლებიან მასას დავასხათ ცოტა ძმარი და კარგად ავზილოთ. საქონლის გულ-ღვიძლი წვრილად დავჭრათ ავურიოთ მომზადებული საკმაზი და ბროწეულის მარცვლები. გემოვნებით კიდევ დავუმატოთ ძმარი, მარილი და წიწაკა.\n"

    }
}