// vue.config.js
module.exports = {

  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8090',
        ws: true,
        changeOrigin: true
      }
    },
    https: false
  },

  outputDir: 'target/dist',
  assetsDir: 'static'
};
