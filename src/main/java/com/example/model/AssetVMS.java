package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Node("VMS")
@Table("asset_instance_vms")
public class AssetVMS {
    @Id
    private Long id;
    private String displayName;
    private String hostIdentify;
    private String domain;
    private String ciId;
    private String sshIp;
    private String calBusinessIp;
    private String calOpePerson;
    private String hostAbbr;
    private String smStatus;
    private String alarmReceiver;
    private String vcpuNumber;
    private String memoryCapacity;
    private String storageIp;
    private String monitorIp;
    private String monitorStatus;
    private String agentVersion;
    private String automationHostId;
    private String zabbixHostId;
    private String osVersion;
    private String zabbixTemplates;
    private String hostGroups;
    private String createTime;
    private String updateTime;
    private String maintenanceType;
    private String ognname;
    private String area;
    private String baseMonitor;
    private String portMonitor;
    private String ciCreateTime;
    private String extraBusinessIp;
    private String deviceVendor;
    private String dbmwLink;
    private String belongsEsxName;
    private String firstUnmonitoredTime;
}
