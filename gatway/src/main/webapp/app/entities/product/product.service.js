(function() {
    'use strict';
    angular
        .module('gatwayApp')
        .factory('Product', Product);

    Product.$inject = ['$resource'];

    function Product ($resource) {
        var resourceUrl =  'catalog/' + 'api/products/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                    }
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    }
})();
