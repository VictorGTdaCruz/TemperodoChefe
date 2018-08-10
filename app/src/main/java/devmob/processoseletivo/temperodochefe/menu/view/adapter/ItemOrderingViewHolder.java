package devmob.processoseletivo.temperodochefe.menu.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import devmob.processoseletivo.temperodochefe.R;
import devmob.processoseletivo.temperodochefe.core.entities.ItemMenu;
import devmob.processoseletivo.temperodochefe.menu.view.MenuItemClickInterface;

public class ItemOrderingViewHolder extends RecyclerView.ViewHolder{

    private ImageView item_img;
    private TextView item_name;
    private TextView item_price;
    private Button item_btn_order;

    ItemOrderingViewHolder(View itemView) {
        super(itemView);

        item_name = itemView.findViewById(R.id.item_txt_name_ordering);
        item_price = itemView.findViewById(R.id.item_txt_price_ordering);
        item_img = itemView.findViewById(R.id.item_img_ordering);
        item_btn_order = itemView.findViewById(R.id.item_btn_order);
    }

    public void bindData(final ItemMenu itemMenu, final MenuItemClickInterface clickInterface) {
        item_name.setText(itemMenu.getName());

        String price = Integer.toString(itemMenu.getPrice());
        item_price.setText(price);

        item_btn_order.setText(R.string.menu_item_btn_text);
        item_btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickInterface.onClickItemButton(itemMenu);
            }
        });
    }
}
