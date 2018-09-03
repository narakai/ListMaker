package clem.app.listmaker

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionRecyclerViewAdapter.ListSelectionViewHolder>() {
    private val listOfTitles = arrayOf("Shopping List", "Chores", "Android Tutorials")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_selection_view_holder, parent, false)
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfTitles.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.listPosition.text = (position + 1).toString()
        holder.listTitle.text = listOfTitles[position]
    }

    class ListSelectionViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val listPosition = itemView?.findViewById<TextView>(R.id.itemNumber) as TextView
        val listTitle = itemView?.findViewById<TextView>(R.id.itemString) as TextView
    }

}