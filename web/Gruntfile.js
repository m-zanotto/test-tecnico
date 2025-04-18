module.exports = function (grunt) {
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),



        browserSync: {
            dev: {
                bsFiles: {
                    src: ['src/**/*.html', 'src/**/*.css', 'src/**/*.js']
                },
                options: {
                    proxy: 'localhost:8084',
                    watchTask: true
                }
            }
        },

        watch: {
            files: ['src/**/*']
        }
    });

    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-browser-sync');
    grunt.loadNpmTasks('grunt-contrib-watch');


    grunt.registerTask('default', ['browserSync:dev', 'watch']);
}; 