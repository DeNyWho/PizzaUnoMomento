//package com.example.pizzaunomomento.Adapter
//
//import android.graphics.Color
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.annotation.NonNull
//import androidx.recyclerview.widget.RecyclerView
//import com.example.pizzaunomomento.R
//
//class Adapter internal constructor(private val colors: List<String>) :
//    RecyclerView.Adapter<Adapter.AdapterViewHolder?>() {
//    @NonNull
//    override fun onCreateViewHolder(@NonNull viewGroup: ViewGroup, position: Int): AdapterViewHolder {
//        val rootView: View =
//            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_page, viewGroup, false)
//        return AdapterViewHolder(rootView)
//    }
//
//    override fun onBindViewHolder(@NonNull adapterViewHolder: AdapterViewHolder, position: Int) {
//        adapterViewHolder.bind(colors[position])
//    }
//
//    override fun getItemCount(): Int {
//        return colors.size
//    }
//
//    class AdapterViewHolder(@NonNull itemView: View) :
//        RecyclerView.ViewHolder(itemView) {
//        private val colorTextView: TextView = itemView.findViewById(R.id.color_text_view)
//        private val container: ViewGroup = itemView.findViewById(R.id.container)
//        fun bind(color: String) {
//            colorTextView.text = color
//            container.setBackgroundColor(Color.parseColor(color))
//        }
//
//    }
//}