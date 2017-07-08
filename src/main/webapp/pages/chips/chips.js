Application.$controller("chipsPageController", ["$scope", "ChartService", function($scope, ChartService) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {

        var postCallback = ChartService.postPlotChartProcess;
        ChartService.postPlotChartProcess = function() {
            var chart = $scope.Widgets.chart1;
            var label = WM.element('#wmChart' + chart.$id + ' svg .nv-x .nv-axislabel')[0];
            label.style = "display : none";
            postCallback(chart);
        }
    };
}]);