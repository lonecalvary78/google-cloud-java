/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.vmmigration.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class CloneJobName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_SOURCE_MIGRATING_VM_CLONE_JOB =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/sources/{source}/migratingVms/{migrating_vm}/cloneJobs/{clone_job}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String source;
  private final String migratingVm;
  private final String cloneJob;

  @Deprecated
  protected CloneJobName() {
    project = null;
    location = null;
    source = null;
    migratingVm = null;
    cloneJob = null;
  }

  private CloneJobName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    source = Preconditions.checkNotNull(builder.getSource());
    migratingVm = Preconditions.checkNotNull(builder.getMigratingVm());
    cloneJob = Preconditions.checkNotNull(builder.getCloneJob());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getSource() {
    return source;
  }

  public String getMigratingVm() {
    return migratingVm;
  }

  public String getCloneJob() {
    return cloneJob;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CloneJobName of(
      String project, String location, String source, String migratingVm, String cloneJob) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setSource(source)
        .setMigratingVm(migratingVm)
        .setCloneJob(cloneJob)
        .build();
  }

  public static String format(
      String project, String location, String source, String migratingVm, String cloneJob) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setSource(source)
        .setMigratingVm(migratingVm)
        .setCloneJob(cloneJob)
        .build()
        .toString();
  }

  public static CloneJobName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_SOURCE_MIGRATING_VM_CLONE_JOB.validatedMatch(
            formattedString, "CloneJobName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("source"),
        matchMap.get("migrating_vm"),
        matchMap.get("clone_job"));
  }

  public static List<CloneJobName> parseList(List<String> formattedStrings) {
    List<CloneJobName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CloneJobName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CloneJobName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_SOURCE_MIGRATING_VM_CLONE_JOB.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (source != null) {
            fieldMapBuilder.put("source", source);
          }
          if (migratingVm != null) {
            fieldMapBuilder.put("migrating_vm", migratingVm);
          }
          if (cloneJob != null) {
            fieldMapBuilder.put("clone_job", cloneJob);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_SOURCE_MIGRATING_VM_CLONE_JOB.instantiate(
        "project",
        project,
        "location",
        location,
        "source",
        source,
        "migrating_vm",
        migratingVm,
        "clone_job",
        cloneJob);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CloneJobName that = ((CloneJobName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.source, that.source)
          && Objects.equals(this.migratingVm, that.migratingVm)
          && Objects.equals(this.cloneJob, that.cloneJob);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(source);
    h *= 1000003;
    h ^= Objects.hashCode(migratingVm);
    h *= 1000003;
    h ^= Objects.hashCode(cloneJob);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/sources/{source}/migratingVms/{migrating_vm}/cloneJobs/{clone_job}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String source;
    private String migratingVm;
    private String cloneJob;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getSource() {
      return source;
    }

    public String getMigratingVm() {
      return migratingVm;
    }

    public String getCloneJob() {
      return cloneJob;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    public Builder setMigratingVm(String migratingVm) {
      this.migratingVm = migratingVm;
      return this;
    }

    public Builder setCloneJob(String cloneJob) {
      this.cloneJob = cloneJob;
      return this;
    }

    private Builder(CloneJobName cloneJobName) {
      this.project = cloneJobName.project;
      this.location = cloneJobName.location;
      this.source = cloneJobName.source;
      this.migratingVm = cloneJobName.migratingVm;
      this.cloneJob = cloneJobName.cloneJob;
    }

    public CloneJobName build() {
      return new CloneJobName(this);
    }
  }
}
