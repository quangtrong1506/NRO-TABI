package com.girlkun.models.reward;

import java.util.ArrayList;
import java.util.List;

import com.girlkun.models.map.ItemMap;
import com.girlkun.models.player.Player;

import lombok.Data;


@Data
public class MobReward {

    private int mobId;

    private List<ItemMobReward> itemReward;
    private List<ItemMobReward> goldReward;

    public MobReward(int mobId) {
        this.mobId = mobId;
        this.itemReward = new ArrayList<>();
        this.goldReward = new ArrayList<>();
    }

    public List<ItemMobReward> getGoldReward() {
        return this.goldReward;
    }

    public List<ItemMobReward> getItemReward() {
        return this.itemReward;
    }

}



















