package com.example.opggProject.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum SoloRank {

    BRONZE("Bronze", 0),
    SILVER("Silver", 1),
    GOLD("Gold", 2),
    PLATINUM("Platinum", 3),
    DIAMOND("Diamond", 4),
    MASTER("Master", 5),
    GRANDMASTER("Grandmaster", 6),
    CHALLENGER("Challenger", 7);

    private String name;
    private Integer number;
}
