package com.datagene.daggerexample22.ui

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.datagene.daggerexample22.R
import com.datagene.daggerexample22.data.model.Screenshot
import com.datagene.daggerexample22.utils.Utils
import kotlinx.android.synthetic.main.screenshot_item.view.*

class DealAdapter(private val myDataset: List<Screenshot>) :
        RecyclerView.Adapter<DealAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val titleText = itemView.textView
        val timeText = itemView.time
        val imageView = itemView.imageView

        fun bindPost(screenshot: Screenshot) {
            with(screenshot) {
                titleText.text = url
                timeText.text = Utils.getTime(timeStamp)
                imageView.setImageBitmap(BitmapFactory.decodeFile(imageLocation))
            }
        }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): DealAdapter.MyViewHolder {
        // create a new view
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.screenshot_item, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(textView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.bindPost(myDataset[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}