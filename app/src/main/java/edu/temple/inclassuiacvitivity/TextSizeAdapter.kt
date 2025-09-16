package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _values: Array<Int>): BaseAdapter() {

    private val context = _context
    private val values = _values

    override fun getCount(): Int {
        return values.size
    }

    override fun getItem(position: Int): Any {
        return values[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if(convertView != null){
            textView = convertView as TextView
        }else{
            textView = TextView(context)
            textView.setPadding(5, 10, 0, 10)
        }
        textView.text = values[position].toString()
        textView.textSize = 22f
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return (getView(position, convertView, parent) as TextView).apply{
            textSize = values[position].toFloat()
        }
    }

}