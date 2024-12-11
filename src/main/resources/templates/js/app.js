new Vue({
    el: '#app',
    data: {
        samples: []
    },
    mounted() {
        this.fetchSamples();
    },
    methods: {
        fetchSamples() {
            fetch('/api/samples')
                .then(response => response.json())
                .then(data => {
                    this.samples = data;
                });
        }
    },
    template: `
        <div>
            <ul>
                <li v-for="sample in samples" :key="sample.name">
                    <strong>{{ sample.name }}</strong> - 
                    <span>{{ sample.type }}</span> - 
                    <span>{{ sample.status }}</span>
                </li>
            </ul>
        </div>
    `
});
