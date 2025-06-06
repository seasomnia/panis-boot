/*
* All Rights Reserved: Copyright [2024] [Zhuang Pan (paynezhuang@gmail.com)]
* Open Source Agreement: Apache License, Version 2.0
* For educational purposes only, commercial use shall comply with the author's copyright information.
* The author does not guarantee or assume any responsibility for the risks of using software.
*
* Licensed under the Apache License, Version 2.0 (the "License").
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.izpan.modules.system.domain.dto.notice;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
* 通知公告 查询 DTO 对象
*
* @Author payne.zhuang <paynezhuang@gmail.com>
* @ProjectName panis-boot
* @ClassName com.izpan.modules.system.domain.dto.notice.SysNoticeSearchDTO
* @CreateTime 2024-11-10 - 12:55:52
*/

@Getter
@Setter
@Schema(name = "SysNoticeSearchDTO", description = "通知公告 查询 DTO 对象")
public class SysNoticeSearchDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -8073049848808559506L;

    @Schema(description = "分类 1:通知 2:公告")
    private String category;

    @Schema(description = "标题")
    private String title;

}