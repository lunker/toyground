const webpack=require('webpack');

module.exports = {

		entry:'src/main/resources/static/app.js', // -- webpack을 수행할 bundle 대상 js file 들 
		output : {
			path: __dirname + 'src/main/resources/static', 
			filename : 'bundle.js'
		}, // entry에 지정된 파일들을 bundling한 결과물 처리 

    devServer: {
        inline: true,
        port: 10909,
        // contentBase: __dirname + '/public/'
    },

    plugins: [
        new webpack.NamedModulesPlugin() //브라우저에서 HMR 에러발생시 module name 표시
    ],

    module: {
        loaders: [
            {
                test: /\.js$/,
                loader: 'babel-loader',
                exclude: /node_modules/,
                query: {
                    cacheDirectory: true,
                    presets: ['es2015', 'react']
                }
            }
        ]
    }
};
