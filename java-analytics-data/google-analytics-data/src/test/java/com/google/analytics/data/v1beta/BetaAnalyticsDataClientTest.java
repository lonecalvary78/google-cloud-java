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

package com.google.analytics.data.v1beta;

import static com.google.analytics.data.v1beta.BetaAnalyticsDataClient.ListAudienceExportsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class BetaAnalyticsDataClientTest {
  private static MockBetaAnalyticsData mockBetaAnalyticsData;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BetaAnalyticsDataClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBetaAnalyticsData = new MockBetaAnalyticsData();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockBetaAnalyticsData));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    BetaAnalyticsDataSettings settings =
        BetaAnalyticsDataSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BetaAnalyticsDataClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void runReportTest() throws Exception {
    RunReportResponse expectedResponse =
        RunReportResponse.newBuilder()
            .addAllDimensionHeaders(new ArrayList<DimensionHeader>())
            .addAllMetricHeaders(new ArrayList<MetricHeader>())
            .addAllRows(new ArrayList<Row>())
            .addAllTotals(new ArrayList<Row>())
            .addAllMaximums(new ArrayList<Row>())
            .addAllMinimums(new ArrayList<Row>())
            .setRowCount(1340416618)
            .setMetadata(ResponseMetaData.newBuilder().build())
            .setPropertyQuota(PropertyQuota.newBuilder().build())
            .setKind("kind3292052")
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    RunReportRequest request =
        RunReportRequest.newBuilder()
            .setProperty("property-993141291")
            .addAllDimensions(new ArrayList<Dimension>())
            .addAllMetrics(new ArrayList<Metric>())
            .addAllDateRanges(new ArrayList<DateRange>())
            .setDimensionFilter(FilterExpression.newBuilder().build())
            .setMetricFilter(FilterExpression.newBuilder().build())
            .setOffset(-1019779949)
            .setLimit(102976443)
            .addAllMetricAggregations(new ArrayList<MetricAggregation>())
            .addAllOrderBys(new ArrayList<OrderBy>())
            .setCurrencyCode("currencyCode1004773790")
            .setCohortSpec(CohortSpec.newBuilder().build())
            .setKeepEmptyRows(true)
            .setReturnPropertyQuota(true)
            .addAllComparisons(new ArrayList<Comparison>())
            .build();

    RunReportResponse actualResponse = client.runReport(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RunReportRequest actualRequest = ((RunReportRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getDimensionsList(), actualRequest.getDimensionsList());
    Assert.assertEquals(request.getMetricsList(), actualRequest.getMetricsList());
    Assert.assertEquals(request.getDateRangesList(), actualRequest.getDateRangesList());
    Assert.assertEquals(request.getDimensionFilter(), actualRequest.getDimensionFilter());
    Assert.assertEquals(request.getMetricFilter(), actualRequest.getMetricFilter());
    Assert.assertEquals(request.getOffset(), actualRequest.getOffset());
    Assert.assertEquals(request.getLimit(), actualRequest.getLimit());
    Assert.assertEquals(
        request.getMetricAggregationsList(), actualRequest.getMetricAggregationsList());
    Assert.assertEquals(request.getOrderBysList(), actualRequest.getOrderBysList());
    Assert.assertEquals(request.getCurrencyCode(), actualRequest.getCurrencyCode());
    Assert.assertEquals(request.getCohortSpec(), actualRequest.getCohortSpec());
    Assert.assertEquals(request.getKeepEmptyRows(), actualRequest.getKeepEmptyRows());
    Assert.assertEquals(request.getReturnPropertyQuota(), actualRequest.getReturnPropertyQuota());
    Assert.assertEquals(request.getComparisonsList(), actualRequest.getComparisonsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void runReportExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      RunReportRequest request =
          RunReportRequest.newBuilder()
              .setProperty("property-993141291")
              .addAllDimensions(new ArrayList<Dimension>())
              .addAllMetrics(new ArrayList<Metric>())
              .addAllDateRanges(new ArrayList<DateRange>())
              .setDimensionFilter(FilterExpression.newBuilder().build())
              .setMetricFilter(FilterExpression.newBuilder().build())
              .setOffset(-1019779949)
              .setLimit(102976443)
              .addAllMetricAggregations(new ArrayList<MetricAggregation>())
              .addAllOrderBys(new ArrayList<OrderBy>())
              .setCurrencyCode("currencyCode1004773790")
              .setCohortSpec(CohortSpec.newBuilder().build())
              .setKeepEmptyRows(true)
              .setReturnPropertyQuota(true)
              .addAllComparisons(new ArrayList<Comparison>())
              .build();
      client.runReport(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void runPivotReportTest() throws Exception {
    RunPivotReportResponse expectedResponse =
        RunPivotReportResponse.newBuilder()
            .addAllPivotHeaders(new ArrayList<PivotHeader>())
            .addAllDimensionHeaders(new ArrayList<DimensionHeader>())
            .addAllMetricHeaders(new ArrayList<MetricHeader>())
            .addAllRows(new ArrayList<Row>())
            .addAllAggregates(new ArrayList<Row>())
            .setMetadata(ResponseMetaData.newBuilder().build())
            .setPropertyQuota(PropertyQuota.newBuilder().build())
            .setKind("kind3292052")
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    RunPivotReportRequest request =
        RunPivotReportRequest.newBuilder()
            .setProperty("property-993141291")
            .addAllDimensions(new ArrayList<Dimension>())
            .addAllMetrics(new ArrayList<Metric>())
            .addAllDateRanges(new ArrayList<DateRange>())
            .addAllPivots(new ArrayList<Pivot>())
            .setDimensionFilter(FilterExpression.newBuilder().build())
            .setMetricFilter(FilterExpression.newBuilder().build())
            .setCurrencyCode("currencyCode1004773790")
            .setCohortSpec(CohortSpec.newBuilder().build())
            .setKeepEmptyRows(true)
            .setReturnPropertyQuota(true)
            .addAllComparisons(new ArrayList<Comparison>())
            .build();

    RunPivotReportResponse actualResponse = client.runPivotReport(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RunPivotReportRequest actualRequest = ((RunPivotReportRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getDimensionsList(), actualRequest.getDimensionsList());
    Assert.assertEquals(request.getMetricsList(), actualRequest.getMetricsList());
    Assert.assertEquals(request.getDateRangesList(), actualRequest.getDateRangesList());
    Assert.assertEquals(request.getPivotsList(), actualRequest.getPivotsList());
    Assert.assertEquals(request.getDimensionFilter(), actualRequest.getDimensionFilter());
    Assert.assertEquals(request.getMetricFilter(), actualRequest.getMetricFilter());
    Assert.assertEquals(request.getCurrencyCode(), actualRequest.getCurrencyCode());
    Assert.assertEquals(request.getCohortSpec(), actualRequest.getCohortSpec());
    Assert.assertEquals(request.getKeepEmptyRows(), actualRequest.getKeepEmptyRows());
    Assert.assertEquals(request.getReturnPropertyQuota(), actualRequest.getReturnPropertyQuota());
    Assert.assertEquals(request.getComparisonsList(), actualRequest.getComparisonsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void runPivotReportExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      RunPivotReportRequest request =
          RunPivotReportRequest.newBuilder()
              .setProperty("property-993141291")
              .addAllDimensions(new ArrayList<Dimension>())
              .addAllMetrics(new ArrayList<Metric>())
              .addAllDateRanges(new ArrayList<DateRange>())
              .addAllPivots(new ArrayList<Pivot>())
              .setDimensionFilter(FilterExpression.newBuilder().build())
              .setMetricFilter(FilterExpression.newBuilder().build())
              .setCurrencyCode("currencyCode1004773790")
              .setCohortSpec(CohortSpec.newBuilder().build())
              .setKeepEmptyRows(true)
              .setReturnPropertyQuota(true)
              .addAllComparisons(new ArrayList<Comparison>())
              .build();
      client.runPivotReport(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchRunReportsTest() throws Exception {
    BatchRunReportsResponse expectedResponse =
        BatchRunReportsResponse.newBuilder()
            .addAllReports(new ArrayList<RunReportResponse>())
            .setKind("kind3292052")
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    BatchRunReportsRequest request =
        BatchRunReportsRequest.newBuilder()
            .setProperty("property-993141291")
            .addAllRequests(new ArrayList<RunReportRequest>())
            .build();

    BatchRunReportsResponse actualResponse = client.batchRunReports(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchRunReportsRequest actualRequest = ((BatchRunReportsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getRequestsList(), actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchRunReportsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      BatchRunReportsRequest request =
          BatchRunReportsRequest.newBuilder()
              .setProperty("property-993141291")
              .addAllRequests(new ArrayList<RunReportRequest>())
              .build();
      client.batchRunReports(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchRunPivotReportsTest() throws Exception {
    BatchRunPivotReportsResponse expectedResponse =
        BatchRunPivotReportsResponse.newBuilder()
            .addAllPivotReports(new ArrayList<RunPivotReportResponse>())
            .setKind("kind3292052")
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    BatchRunPivotReportsRequest request =
        BatchRunPivotReportsRequest.newBuilder()
            .setProperty("property-993141291")
            .addAllRequests(new ArrayList<RunPivotReportRequest>())
            .build();

    BatchRunPivotReportsResponse actualResponse = client.batchRunPivotReports(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchRunPivotReportsRequest actualRequest =
        ((BatchRunPivotReportsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getRequestsList(), actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchRunPivotReportsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      BatchRunPivotReportsRequest request =
          BatchRunPivotReportsRequest.newBuilder()
              .setProperty("property-993141291")
              .addAllRequests(new ArrayList<RunPivotReportRequest>())
              .build();
      client.batchRunPivotReports(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getMetadataTest() throws Exception {
    Metadata expectedResponse =
        Metadata.newBuilder()
            .setName(MetadataName.of("[PROPERTY]").toString())
            .addAllDimensions(new ArrayList<DimensionMetadata>())
            .addAllMetrics(new ArrayList<MetricMetadata>())
            .addAllComparisons(new ArrayList<ComparisonMetadata>())
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    MetadataName name = MetadataName.of("[PROPERTY]");

    Metadata actualResponse = client.getMetadata(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMetadataRequest actualRequest = ((GetMetadataRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getMetadataExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      MetadataName name = MetadataName.of("[PROPERTY]");
      client.getMetadata(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getMetadataTest2() throws Exception {
    Metadata expectedResponse =
        Metadata.newBuilder()
            .setName(MetadataName.of("[PROPERTY]").toString())
            .addAllDimensions(new ArrayList<DimensionMetadata>())
            .addAllMetrics(new ArrayList<MetricMetadata>())
            .addAllComparisons(new ArrayList<ComparisonMetadata>())
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    String name = "name3373707";

    Metadata actualResponse = client.getMetadata(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMetadataRequest actualRequest = ((GetMetadataRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getMetadataExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      String name = "name3373707";
      client.getMetadata(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void runRealtimeReportTest() throws Exception {
    RunRealtimeReportResponse expectedResponse =
        RunRealtimeReportResponse.newBuilder()
            .addAllDimensionHeaders(new ArrayList<DimensionHeader>())
            .addAllMetricHeaders(new ArrayList<MetricHeader>())
            .addAllRows(new ArrayList<Row>())
            .addAllTotals(new ArrayList<Row>())
            .addAllMaximums(new ArrayList<Row>())
            .addAllMinimums(new ArrayList<Row>())
            .setRowCount(1340416618)
            .setPropertyQuota(PropertyQuota.newBuilder().build())
            .setKind("kind3292052")
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    RunRealtimeReportRequest request =
        RunRealtimeReportRequest.newBuilder()
            .setProperty("property-993141291")
            .addAllDimensions(new ArrayList<Dimension>())
            .addAllMetrics(new ArrayList<Metric>())
            .setDimensionFilter(FilterExpression.newBuilder().build())
            .setMetricFilter(FilterExpression.newBuilder().build())
            .setLimit(102976443)
            .addAllMetricAggregations(new ArrayList<MetricAggregation>())
            .addAllOrderBys(new ArrayList<OrderBy>())
            .setReturnPropertyQuota(true)
            .addAllMinuteRanges(new ArrayList<MinuteRange>())
            .build();

    RunRealtimeReportResponse actualResponse = client.runRealtimeReport(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RunRealtimeReportRequest actualRequest = ((RunRealtimeReportRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getDimensionsList(), actualRequest.getDimensionsList());
    Assert.assertEquals(request.getMetricsList(), actualRequest.getMetricsList());
    Assert.assertEquals(request.getDimensionFilter(), actualRequest.getDimensionFilter());
    Assert.assertEquals(request.getMetricFilter(), actualRequest.getMetricFilter());
    Assert.assertEquals(request.getLimit(), actualRequest.getLimit());
    Assert.assertEquals(
        request.getMetricAggregationsList(), actualRequest.getMetricAggregationsList());
    Assert.assertEquals(request.getOrderBysList(), actualRequest.getOrderBysList());
    Assert.assertEquals(request.getReturnPropertyQuota(), actualRequest.getReturnPropertyQuota());
    Assert.assertEquals(request.getMinuteRangesList(), actualRequest.getMinuteRangesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void runRealtimeReportExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      RunRealtimeReportRequest request =
          RunRealtimeReportRequest.newBuilder()
              .setProperty("property-993141291")
              .addAllDimensions(new ArrayList<Dimension>())
              .addAllMetrics(new ArrayList<Metric>())
              .setDimensionFilter(FilterExpression.newBuilder().build())
              .setMetricFilter(FilterExpression.newBuilder().build())
              .setLimit(102976443)
              .addAllMetricAggregations(new ArrayList<MetricAggregation>())
              .addAllOrderBys(new ArrayList<OrderBy>())
              .setReturnPropertyQuota(true)
              .addAllMinuteRanges(new ArrayList<MinuteRange>())
              .build();
      client.runRealtimeReport(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void checkCompatibilityTest() throws Exception {
    CheckCompatibilityResponse expectedResponse =
        CheckCompatibilityResponse.newBuilder()
            .addAllDimensionCompatibilities(new ArrayList<DimensionCompatibility>())
            .addAllMetricCompatibilities(new ArrayList<MetricCompatibility>())
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    CheckCompatibilityRequest request =
        CheckCompatibilityRequest.newBuilder()
            .setProperty("property-993141291")
            .addAllDimensions(new ArrayList<Dimension>())
            .addAllMetrics(new ArrayList<Metric>())
            .setDimensionFilter(FilterExpression.newBuilder().build())
            .setMetricFilter(FilterExpression.newBuilder().build())
            .setCompatibilityFilter(Compatibility.forNumber(0))
            .build();

    CheckCompatibilityResponse actualResponse = client.checkCompatibility(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CheckCompatibilityRequest actualRequest = ((CheckCompatibilityRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getDimensionsList(), actualRequest.getDimensionsList());
    Assert.assertEquals(request.getMetricsList(), actualRequest.getMetricsList());
    Assert.assertEquals(request.getDimensionFilter(), actualRequest.getDimensionFilter());
    Assert.assertEquals(request.getMetricFilter(), actualRequest.getMetricFilter());
    Assert.assertEquals(request.getCompatibilityFilter(), actualRequest.getCompatibilityFilter());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void checkCompatibilityExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      CheckCompatibilityRequest request =
          CheckCompatibilityRequest.newBuilder()
              .setProperty("property-993141291")
              .addAllDimensions(new ArrayList<Dimension>())
              .addAllMetrics(new ArrayList<Metric>())
              .setDimensionFilter(FilterExpression.newBuilder().build())
              .setMetricFilter(FilterExpression.newBuilder().build())
              .setCompatibilityFilter(Compatibility.forNumber(0))
              .build();
      client.checkCompatibility(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAudienceExportTest() throws Exception {
    AudienceExport expectedResponse =
        AudienceExport.newBuilder()
            .setName(AudienceExportName.of("[PROPERTY]", "[AUDIENCE_EXPORT]").toString())
            .setAudience("audience975628804")
            .setAudienceDisplayName("audienceDisplayName1537141193")
            .addAllDimensions(new ArrayList<AudienceDimension>())
            .setBeginCreatingTime(Timestamp.newBuilder().build())
            .setCreationQuotaTokensCharged(1232901266)
            .setRowCount(1340416618)
            .setErrorMessage("errorMessage1203236063")
            .setPercentageCompleted(-1292047642)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createAudienceExportTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBetaAnalyticsData.addResponse(resultOperation);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    AudienceExport audienceExport = AudienceExport.newBuilder().build();

    AudienceExport actualResponse = client.createAudienceExportAsync(parent, audienceExport).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAudienceExportRequest actualRequest =
        ((CreateAudienceExportRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(audienceExport, actualRequest.getAudienceExport());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAudienceExportExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      AudienceExport audienceExport = AudienceExport.newBuilder().build();
      client.createAudienceExportAsync(parent, audienceExport).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createAudienceExportTest2() throws Exception {
    AudienceExport expectedResponse =
        AudienceExport.newBuilder()
            .setName(AudienceExportName.of("[PROPERTY]", "[AUDIENCE_EXPORT]").toString())
            .setAudience("audience975628804")
            .setAudienceDisplayName("audienceDisplayName1537141193")
            .addAllDimensions(new ArrayList<AudienceDimension>())
            .setBeginCreatingTime(Timestamp.newBuilder().build())
            .setCreationQuotaTokensCharged(1232901266)
            .setRowCount(1340416618)
            .setErrorMessage("errorMessage1203236063")
            .setPercentageCompleted(-1292047642)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createAudienceExportTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBetaAnalyticsData.addResponse(resultOperation);

    String parent = "parent-995424086";
    AudienceExport audienceExport = AudienceExport.newBuilder().build();

    AudienceExport actualResponse = client.createAudienceExportAsync(parent, audienceExport).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAudienceExportRequest actualRequest =
        ((CreateAudienceExportRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(audienceExport, actualRequest.getAudienceExport());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAudienceExportExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      String parent = "parent-995424086";
      AudienceExport audienceExport = AudienceExport.newBuilder().build();
      client.createAudienceExportAsync(parent, audienceExport).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void queryAudienceExportTest() throws Exception {
    QueryAudienceExportResponse expectedResponse =
        QueryAudienceExportResponse.newBuilder()
            .setAudienceExport(AudienceExport.newBuilder().build())
            .addAllAudienceRows(new ArrayList<AudienceRow>())
            .setRowCount(1340416618)
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    String name = "name3373707";

    QueryAudienceExportResponse actualResponse = client.queryAudienceExport(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    QueryAudienceExportRequest actualRequest = ((QueryAudienceExportRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void queryAudienceExportExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      String name = "name3373707";
      client.queryAudienceExport(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAudienceExportTest() throws Exception {
    AudienceExport expectedResponse =
        AudienceExport.newBuilder()
            .setName(AudienceExportName.of("[PROPERTY]", "[AUDIENCE_EXPORT]").toString())
            .setAudience("audience975628804")
            .setAudienceDisplayName("audienceDisplayName1537141193")
            .addAllDimensions(new ArrayList<AudienceDimension>())
            .setBeginCreatingTime(Timestamp.newBuilder().build())
            .setCreationQuotaTokensCharged(1232901266)
            .setRowCount(1340416618)
            .setErrorMessage("errorMessage1203236063")
            .setPercentageCompleted(-1292047642)
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    AudienceExportName name = AudienceExportName.of("[PROPERTY]", "[AUDIENCE_EXPORT]");

    AudienceExport actualResponse = client.getAudienceExport(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAudienceExportRequest actualRequest = ((GetAudienceExportRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAudienceExportExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      AudienceExportName name = AudienceExportName.of("[PROPERTY]", "[AUDIENCE_EXPORT]");
      client.getAudienceExport(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAudienceExportTest2() throws Exception {
    AudienceExport expectedResponse =
        AudienceExport.newBuilder()
            .setName(AudienceExportName.of("[PROPERTY]", "[AUDIENCE_EXPORT]").toString())
            .setAudience("audience975628804")
            .setAudienceDisplayName("audienceDisplayName1537141193")
            .addAllDimensions(new ArrayList<AudienceDimension>())
            .setBeginCreatingTime(Timestamp.newBuilder().build())
            .setCreationQuotaTokensCharged(1232901266)
            .setRowCount(1340416618)
            .setErrorMessage("errorMessage1203236063")
            .setPercentageCompleted(-1292047642)
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    String name = "name3373707";

    AudienceExport actualResponse = client.getAudienceExport(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAudienceExportRequest actualRequest = ((GetAudienceExportRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAudienceExportExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      String name = "name3373707";
      client.getAudienceExport(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAudienceExportsTest() throws Exception {
    AudienceExport responsesElement = AudienceExport.newBuilder().build();
    ListAudienceExportsResponse expectedResponse =
        ListAudienceExportsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAudienceExports(Arrays.asList(responsesElement))
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListAudienceExportsPagedResponse pagedListResponse = client.listAudienceExports(parent);

    List<AudienceExport> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAudienceExportsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAudienceExportsRequest actualRequest = ((ListAudienceExportsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAudienceExportsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listAudienceExports(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAudienceExportsTest2() throws Exception {
    AudienceExport responsesElement = AudienceExport.newBuilder().build();
    ListAudienceExportsResponse expectedResponse =
        ListAudienceExportsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAudienceExports(Arrays.asList(responsesElement))
            .build();
    mockBetaAnalyticsData.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAudienceExportsPagedResponse pagedListResponse = client.listAudienceExports(parent);

    List<AudienceExport> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAudienceExportsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBetaAnalyticsData.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAudienceExportsRequest actualRequest = ((ListAudienceExportsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAudienceExportsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBetaAnalyticsData.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAudienceExports(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
