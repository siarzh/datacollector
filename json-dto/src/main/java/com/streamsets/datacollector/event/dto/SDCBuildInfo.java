/*
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package com.streamsets.datacollector.event.dto;

public class SDCBuildInfo {

  private String version;
  private String builtDate;
  private String builtBy;
  private String builtRepoSha;
  private String sourceMd5Checksum;

  public SDCBuildInfo() {
  }

  public SDCBuildInfo(String version, String builtDate, String builtBy, String builtRepoSha, String sourceMd5Checksum) {
    this.version = version;
    this.builtDate = builtDate;
    this.builtBy = builtBy;
    this.builtRepoSha = builtRepoSha;
    this.sourceMd5Checksum = sourceMd5Checksum;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getBuiltDate() {
    return builtDate;
  }

  public void setBuiltDate(String builtDate) {
    this.builtDate = builtDate;
  }

  public String getBuiltBy() {
    return builtBy;
  }

  public void setBuiltBy(String builtBy) {
    this.builtBy = builtBy;
  }

  public String getBuiltRepoSha() {
    return builtRepoSha;
  }

  public void setBuiltRepoSha(String builtRepoSha) {
    this.builtRepoSha = builtRepoSha;
  }

  public String getSourceMd5Checksum() {
    return sourceMd5Checksum;
  }

  public void setSourceMd5Checksum(String sourceMd5Checksum) {
    this.sourceMd5Checksum = sourceMd5Checksum;
  }

}
