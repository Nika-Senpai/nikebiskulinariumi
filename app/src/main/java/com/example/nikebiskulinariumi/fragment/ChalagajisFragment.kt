package com.example.nikebiskulinariumi.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.nikebiskulinariumi.R

class ChalagajisFragment : Fragment(R.layout.fragment_chalagaji) {

    private lateinit var ingredient: TextView
    private lateinit var shemadgenloba: TextView
    private lateinit var wesi1: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ingredient = requireView().findViewById(R.id. ingredient)
        shemadgenloba = requireView().findViewById(R.id. shemadgenloba)
        wesi1 = requireView().findViewById(R.id. wesi1)

        shemadgenloba.text = "საქონლის ხორცი - მკერდის ნაწილი (კარეიკა) 700 გ\n" + "მარილი და პილპილი - გემოვნებით" + "\n" + "ხმელი ქინძი - 1/4 ჩ/კ" + "\n" + "მდოგვი - 10 გ" + "\n" + "ნიორი - 1 კბილი"

        wesi1.text = "გარეცხეთ ხორცი, შემდეგ კი კარგად შეამშრალეთ ქაღალდის ხელსახოცის მეშვეობით.\n" +
                "დაამარინადეთ სანელებლების (მარილი, პილპილი, ხმელი ქინძი და მდოგვი) ნაზავში. წაუსვით ზეთი შეწვით 240 გრადუსზე 10-15 წუთს განმავლობაში." + "\n" +
                "რჩევა: აჯობებს მოათვსოთ ცხაურზე ფოლგა და მასზე ხორცის ნაჭერი და ასე შეწვათ." + "\n" +
                "სუფრასთან მიტანის წინ წაუსვით ცხელ ხორცის ნაჭერს გახეხილი ნიორი." + "\n" +
                "გემრიელად მიირთვით!" + "\n"


    }
}