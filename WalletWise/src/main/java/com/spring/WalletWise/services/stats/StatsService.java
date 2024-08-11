package com.spring.WalletWise.services.stats;

import com.spring.WalletWise.dto.GraphDTO;
import com.spring.WalletWise.dto.StatsDTO;

public interface StatsService {
    GraphDTO getChartData();
    StatsDTO getStats();
}
