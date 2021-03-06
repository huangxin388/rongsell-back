package com.bupt.rongsell.controller.backend;

import com.bupt.rongsell.common.ServerResponse;
import com.bupt.rongsell.entity.Group;
import com.bupt.rongsell.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author huang xin
 * @Date 2020/7/8 15:10
 * @Version 1.0
 */
@RestController
@RequestMapping("/manage/group")
public class GroupManageController {

    @Autowired
    private GroupService groupService;

    @PostMapping("/getparallelchildrengroup")
    public ServerResponse<List<Group>> getParallelChildrenCategory(@RequestParam(value = "parentId",
            defaultValue = "0") Integer parentId) {
        return groupService.getParallelChildrenGroup(parentId);
    }
}
