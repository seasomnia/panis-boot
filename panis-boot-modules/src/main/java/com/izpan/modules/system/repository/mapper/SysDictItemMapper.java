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

package com.izpan.modules.system.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.izpan.modules.system.domain.entity.SysDictItem;

import java.util.List;

/**
 * 数据字典子项管理 Mapper 接口层
 *
 * @Author payne.zhuang <paynezhuang@gmail.com>
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.system.repository.mapper.SysDictItemMapper
 * @CreateTime 2024-06-27 - 22:03:29
 */

public interface SysDictItemMapper extends BaseMapper<SysDictItem> {

    /**
     * 查询所有dict项目
     *
     * @param code 查询 code
     * @return {@link List }<{@link SysDictItem }> 查询结果集合
     * @author payne.zhuang
     * @CreateTime 2024-07-27 - 18:14:26
     */
    List<SysDictItem> queryAllDictItemList(String code);
}