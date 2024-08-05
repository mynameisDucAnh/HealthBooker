const { defineConfig } = require('@vue/cli-service');
const webpack = require('webpack');

module.exports = defineConfig({
  transpileDependencies: true,
  configureWebpack: {
    plugins: [
      new webpack.DefinePlugin({
        __VUE_OPTIONS_API__: JSON.stringify(true), // Bật Options API
        __VUE_PROD_DEVTOOLS__: JSON.stringify(false), // Tắt devtools trong môi trường production
        __VUE_PROD_HYDRATION_MISMATCH_DETAILS__: JSON.stringify(false), // Tắt cảnh báo chi tiết khi không khớp hydration
      }),
    ],
  },
});
